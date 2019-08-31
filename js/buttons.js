var id = null;
function getID(theId) {
    id = theId;
    if(id) {
        loadSite(id);
    } else {
        console.log("Error");
    }
};

function loadSite(id) {
    switch(id) {
        case 'b_dashb':
            window.location.href = 'index.html';
            break;
        case 'b_sb':
            window.location.href = 'html/sb.html';
            break;
    }
}