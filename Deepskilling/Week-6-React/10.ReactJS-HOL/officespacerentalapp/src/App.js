import './App.css';

function App() {

  const officeSpaces = [
    {
      name: "Sky Tower",
      rent: 55000,
      address: "Noida, Uttar Pradesh",
      image: "https://images.unsplash.com/photo-1497366754035-f200968a6e72?w=800"
    },
    {
      name: "Tech Park",
      rent: 75000,
      address: "Gurugram, Haryana",
      image: "https://images.unsplash.com/photo-1497366811353-6870744d04b2?w=800"
    },
    {
      name: "Business Hub",
      rent: 65000,
      address: "Bangalore, Karnataka",
      image: "https://images.unsplash.com/photo-1497366412874-3415097a27e7?w=800"
    }
  ];

  return (
    <div className="App">
      <h1>Office Space Rental App</h1>

      {officeSpaces.map((office, index) => (
        <div className="card" key={index}>
          <img src={office.image} alt={office.name} />

          <h2>{office.name}</h2>

          <p>
            <strong>Rent: </strong>
            <span
              style={{
                color: office.rent < 60000 ? "red" : "green",
                fontWeight: "bold"
              }}
            >
              ₹{office.rent}
            </span>
          </p>

          <p>
            <strong>Address:</strong> {office.address}
          </p>
        </div>
      ))}
    </div>
  );
}

export default App;