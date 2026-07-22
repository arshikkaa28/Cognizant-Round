import React from "react";

function CalculateScore(props) {
  const average = props.total / props.goal;

  return (
    <div>
      <h2>Student Details</h2>
      <p>Name: {props.name}</p>
      <p>School: {props.school}</p>
      <p>Total Marks: {props.total}</p>
      <p>Goal: {props.goal}</p>
      <h3>Average Score: {average}</h3>
    </div>
  );
}

export default CalculateScore;