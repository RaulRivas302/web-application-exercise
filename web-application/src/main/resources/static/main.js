document.addEventListener('DOMContentLoaded', function () {
    initialize();
});

let lastSearchResults = [];
let lastSearchType = 'patients';
let currentLevel = 0;
let currentPage = 0;
const pageSize = 10;

/**
 * Initializes the event listeners and triggers the initial search.
 */
function initialize() {
    search();
    document.getElementById('entity-select').addEventListener('change', handleEntityChange);
    document.getElementById('previous-page-button').addEventListener('click', goToPreviousPage);
    document.getElementById('next-page-button').addEventListener('click', goToNextPage);
    document.getElementById('search-field').addEventListener('keypress', function(event) {
        if (event.key === 'Enter') {
            search();
        }
    });
}

/**
 * Handles the change in the entity dropdown, clears the search field, and resets the search.
 */
function handleEntityChange() {
    const searchField = document.getElementById('search-field');
    const selectedEntity = document.getElementById('entity-select').value;
    searchField.value = ''; // Clear the search input field
    searchField.placeholder = `Search ${selectedEntity}...`;
    resetSearch();
}

/**
 * Resets the current page to 0 and triggers a new search.
 */
function resetSearch() {
    currentPage = 0;
    search();
}

/**
 * Performs a search based on the selected entity and search input.
 */
async function search() {
    const entity = document.getElementById('entity-select').value;
    const searchField = document.getElementById('search-field').value;
    let url = `/api/${entity}?page=${currentPage}&size=${pageSize}`;

    if (searchField) {
        url = `/api/${entity}/search?name=${searchField}&page=${currentPage}&size=${pageSize}`;
    }

    await fetchDataAndDisplay(url);
}

/**
 * Fetches data from the given URL and handles the display.
 * @param {string} url - The URL to fetch data from.
 */
async function fetchDataAndDisplay(url) {
    // Show loading overlay
    document.getElementById('loading-overlay').style.display = 'flex';

    try {
        const response = await fetch(url);
        const pagedResponse = await response.json();
        const data = pagedResponse.content;

        if (data.length === 0) {
            displayMessage('No data found');
            hideElements(['data-table', 'previous-page-button', 'next-page-button']);
            document.getElementById('back-button').style.display = 'block';
        } else {
            displayMessage('');
            displayData(lastSearchType, data);
            handlePaginationButtons(pagedResponse.hasNextPage);
        }
    } catch (error) {
        displayMessage('Error fetching data');
        console.error('Error:', error);
        hideElements(['data-table', 'previous-page-button', 'next-page-button']);
         document.getElementById('back-button').style.display = 'block';
    } finally {
        // Hide loading overlay
        document.getElementById('loading-overlay').style.display = 'none';
    }
}

/**
 * Displays the message in the message div.
 * @param {string} message - The message to display.
 */
function displayMessage(message) {
    document.getElementById('message').innerText = message;
}

/**
 * Displays the data in the table.
 * @param {string} type - The type of entity being displayed.
 * @param {Array} data - The data to display.
 */
function displayData(type, data) {
    const tableHeader = document.getElementById('table-header');
    const tableBody = document.getElementById('table-body');
    tableHeader.innerHTML = '';
    tableBody.innerHTML = '';
    document.getElementById('back-button').style.display = 'none';
    document.getElementById('data-table').style.display = 'table';

    let headers = Object.keys(data[0]);
    if (type === 'patients') {
        headers.push('Actions');
    }

    let headerRow = '<tr>';
    headers.forEach(header => {
        headerRow += `<th>${header}</th>`;
    });
    headerRow += '</tr>';
    tableHeader.innerHTML = headerRow;

    data.forEach(item => {
        let row = '<tr>';
        headers.forEach(header => {
            if (header === 'Actions') {
                row += `<td>
                          <div class="action-button">
                                    <button class="btn btn-primary" onclick="getDetails('images', '${item.patientId}')">Get Images</button>
                                     <button class="btn btn-secondary" onclick="getDetails('studies', '${item.patientId}')">Get Studies</button>
                                      <button class="btn btn-success" onclick="getDetails('series', '${item.patientId}')">Get Series</button>
                                  </div>
                       </td>`;
            } else {
                row += `<td>${item[header]}</td>`;
            }
        });
        row += '</tr>';
        tableBody.innerHTML += row;
    });

    lastSearchResults = data;
    lastSearchType = type;
}

/**
 * Fetches and displays the details for a specific action and entity.
 * @param {string} action - The type of detail to fetch (images, studies, series).
 * @param {string} id - The ID of the entity.
 */
async function getDetails(action, id) {
    let url;

    switch (action) {
        case 'images':
            url = `/api/images/search?patientId=${id}&page=${currentPage}&size=${pageSize}`;
            break;
        case 'studies':
            url = `/api/studies/search?patientId=${id}&page=${currentPage}&size=${pageSize}`;
            break;
        case 'series':
            url = `/api/series/search?patientId=${id}&page=${currentPage}&size=${pageSize}`;
            break;
        default:
            console.error('Unknown action:', action);
            return;
    }

    await fetchDataAndDisplay(url);
    document.getElementById('back-button').style.display = 'block';
}

/**
 * Navigates back to the previous data view.
 */
function goBack() {
    if (currentLevel > 0) {
        currentLevel--;
        displayData(lastSearchType, lastSearchResults);
        document.getElementById('back-button').style.display = 'none';
    } else {
        window.location.href = '/'; // Redirect to home
    }
}

/**
 * Navigates to the previous page of data.
 */
function goToPreviousPage() {
    if (currentPage > 0) {
        currentPage--;
        search();
    }
}

/**
 * Navigates to the next page of data.
 */
function goToNextPage() {
    currentPage++;
    search();
}

/**
 * Handles the visibility of pagination buttons based on the presence of the next page.
 * @param {boolean} hasNextPage - Indicates whether there is a next page of data.
 */
function handlePaginationButtons(hasNextPage) {
    document.getElementById('previous-page-button').style.display = currentPage > 0 ? 'block' : 'none';
    document.getElementById('next-page-button').style.display = hasNextPage ? 'block' : 'none';
}

/**
 * Hides the specified elements.
 * @param {Array} elementIds - The IDs of the elements to hide.
 */
function hideElements(elementIds) {
    elementIds.forEach(id => {
        document.getElementById(id).style.display = 'none';
    });
}
