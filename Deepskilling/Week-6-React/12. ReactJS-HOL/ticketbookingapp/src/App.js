import React, { useState } from "react";
import "./App.css";

function App() {
  const [isLoggedIn, setIsLoggedIn] = useState(false);

  return (
    <div className="App">
      <h1>Ticket Booking App</h1>

      {isLoggedIn ? (
        <div>
          <h2>Welcome User</h2>

          <h3>Available Flights</h3>

          <table>
            <thead>
              <tr>
                <th>Flight</th>
                <th>From</th>
                <th>To</th>
                <th>Price</th>
              </tr>
            </thead>

            <tbody>
              <tr>
                <td>AI101</td>
                <td>Delhi</td>
                <td>Mumbai</td>
                <td>₹5000</td>
              </tr>

              <tr>
                <td>6E202</td>
                <td>Agra</td>
                <td>Bangalore</td>
                <td>₹6500</td>
              </tr>
            </tbody>
          </table>

          <br />

          <button>Book Ticket</button>

          <br /><br />

          <button onClick={() => setIsLoggedIn(false)}>
            Logout
          </button>
        </div>
      ) : (
        <div>
          <h2>Guest User</h2>

          <h3>Available Flights</h3>

          <table>
            <thead>
              <tr>
                <th>Flight</th>
                <th>From</th>
                <th>To</th>
                <th>Price</th>
              </tr>
            </thead>

            <tbody>
              <tr>
                <td>AI101</td>
                <td>Delhi</td>
                <td>Mumbai</td>
                <td>₹5000</td>
              </tr>

              <tr>
                <td>6E202</td>
                <td>Agra</td>
                <td>Bangalore</td>
                <td>₹6500</td>
              </tr>
            </tbody>
          </table>

          <br />

          <p>Please Login to Book Tickets.</p>

          <button onClick={() => setIsLoggedIn(true)}>
            Login
          </button>
        </div>
      )}
    </div>
  );
}

export default App;