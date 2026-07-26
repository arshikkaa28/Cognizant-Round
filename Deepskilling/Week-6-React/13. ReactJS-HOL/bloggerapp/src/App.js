import React, { useState } from "react";
import "./App.css";

import BookDetails from "./BookDetails";
import BlogDetails from "./BlogDetails";
import CourseDetails from "./CourseDetails";

function App() {

  const [page, setPage] = useState("book");

  return (
    <div className="App">

      <h1>Blogger App</h1>

      <button onClick={() => setPage("book")}>
        Book Details
      </button>

      <button onClick={() => setPage("blog")}>
        Blog Details
      </button>

      <button onClick={() => setPage("course")}>
        Course Details
      </button>

      <hr />

      {page === "book" && <BookDetails />}

      {page === "blog" ? <BlogDetails /> : null}

      {page === "course" && <CourseDetails />}

    </div>
  );
}

export default App;