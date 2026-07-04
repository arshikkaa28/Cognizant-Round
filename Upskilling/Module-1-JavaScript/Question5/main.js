class Event {

    constructor(name, category, seats) {
        this.name = name;
        this.category = category;
        this.seats = seats;
    }

}

Event.prototype.checkAvailability = function () {
    return this.seats > 0;
};

const e1 = new Event("Music Fest", "Music", 30);

console.log(e1.checkAvailability());

Object.entries(e1).forEach(([key, value]) => {
    console.log(key, value);
});