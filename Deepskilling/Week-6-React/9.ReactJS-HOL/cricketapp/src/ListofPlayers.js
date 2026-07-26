import React from "react";

function ListofPlayers() {

  const players = [
    { name: "Virat", score: 80 },
    { name: "Rohit", score: 65 },
    { name: "Gill", score: 50 },
    { name: "Rahul", score: 72 },
    { name: "Hardik", score: 60 },
    { name: "Jadeja", score: 90 },
    { name: "Ashwin", score: 40 },
    { name: "Shami", score: 30 },
    { name: "Bumrah", score: 75 },
    { name: "Siraj", score: 55 },
    { name: "Iyer", score: 85 }
  ];

  // 🔥 filter (<70)
  const lowScorePlayers = players.filter(p => p.score < 70);

  return (
    <div>
      <h2>All Players</h2>
      {
        players.map((p, index) => (
          <p key={index}>{p.name} - {p.score}</p>
        ))
      }

      <h2>Players with Score less than 70</h2>
      {
        lowScorePlayers.map((p, index) => (
          <p key={index}>{p.name} - {p.score}</p>
        ))
      }
    </div>
  );
}

export default ListofPlayers;