import "./App.css";
// import ClassHeader from "./components/ClassHeader";
import React from "react";

import Header from "./components/Header";
import Home from "./components/Home";
import Footer from "./components/footer/Footer";
import "bootstrap/dist/css/bootstrap.min.css";
import "bootstrap/dist/js/bootstrap.bundle.min.js";
import "./custom.scss";

function App() {
  return (
    <>
      <Header />
      <Home />
      <Footer />
    </>
  );
}

export default App;
