let eventList = [];

function addEvent(event) {
    eventList.push(event);
}

function registerUser(event) {
    if (event.seats > 0) {
        event.seats--;
    }
}

function filterEventsByCategory(category, callback) {
    let result = eventList.filter(e => e.category === category);
    callback(result);
}

function registrationCounter() {
    let count = 0;

    return function () {
        count++;
        return count;
    };
}

const musicCounter = registrationCounter();

console.log(musicCounter());
console.log(musicCounter());

filterEventsByCategory("Music", events => console.log(events));