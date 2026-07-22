import React from "react";
import CalculateScore from "./Components/CalculateScore";
import "./Stylesheets/mystyle.css";

function App() {
  return (
    <div>
      <CalculateScore 
        name="Rahul"
        school="ABC School"
        total={500}
        goal={5}
      />
    </div>
  );
}

export default App;