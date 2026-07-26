import React, { useState } from "react";
import "./App.css";

function App() {
  const [count, setCount] = useState(0);
  const [rupees, setRupees] = useState("");
  const [euro, setEuro] = useState("");

  // Increment
  const increment = () => {
    setCount(count + 1);
  };

  // Decrement
  const decrement = () => {
    setCount(count - 1);
  };

  // Static Hello Message
  const sayHello = () => {
    alert("Hello! Have a Nice Day.");
  };

  // Multiple Functions
  const handleIncrement = () => {
    increment();
    sayHello();
  };

  // Welcome Message
  const sayWelcome = (msg) => {
    alert(msg);
  };

  // Synthetic Event
  const onPress = () => {
    alert("I was clicked");
  };

  // Currency Convertor
  const handleSubmit = () => {
    const result = (parseFloat(rupees) / 90).toFixed(2);
    setEuro(result);
  };

  return (
    <div className="App">
      <h1>React Event Examples</h1>

      <h2>Counter : {count}</h2>

      <button onClick={handleIncrement}>Increment</button>

      <button onClick={decrement}>Decrement</button>

      <br /><br />

      <button onClick={() => sayWelcome("Welcome")}>
        Say Welcome
      </button>

      <br /><br />

      <button onClick={onPress}>
        Synthetic Event
      </button>

      <hr />

      <h2>Currency Convertor</h2>

      <input
        type="number"
        placeholder="Enter Rupees"
        value={rupees}
        onChange={(e) => setRupees(e.target.value)}
      />

      <br /><br />

      <button onClick={handleSubmit}>
        Convert
      </button>

      <h3>Euro : {euro}</h3>

    </div>
  );
}

export default App;