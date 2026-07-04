const events = [
    { name: "Music Fest", seats: 20, upcoming: true },
    { name: "Food Fair", seats: 0, upcoming: true },
    { name: "Yoga Camp", seats: 30, upcoming: false }
];

events.forEach(event => {
    if (event.upcoming && event.seats > 0) {
        console.log(event.name);
    }
});

function register(event) {
    try {
        if (event.seats <= 0)
            throw new Error("No seats available");

        event.seats--;
        console.log("Registration Successful");
    } catch (error) {
        console.log(error.message);
    }
}

register(events[0]);
register(events[1]);