import React, { useState } from "react";
import axios from "axios";

const UserData = () => {
  let [userDetails, setUserDetails] = useState({
    name: "",
    email: "",
    phone: "",
    password: "",
  });
  let { name, email, phone, password } = userDetails;

  let handleChange = (e) => {
    let { name, value } = e.target;
    setUserDetails({ ...userDetails, [name]: value });
  };
  const handleSubmit = async (e) => {
    e.preventDefault();
    try {
      // Send form data to the API
      const response = await axios.post(
        "http://localhost:8080/save",
        userDetails
      );
      // console.log(response.data);
    } catch (error) {
      console.error("Error submitting form:", error);
    }
    setUserDetails({
      name: "",
      email: "",
      phone: "",
      password: "",
    });
  };
  return (
    <div>
      <form action="" onSubmit={handleSubmit}>
        <label htmlFor="name">Name : </label>
        <input
          type="text"
          id="name"
          name="name"
          onChange={handleChange}
          value={name}
        />
        <br />
        <label htmlFor="email">Email : </label>
        <input
          type="email"
          name="email"
          id="email"
          onChange={handleChange}
          value={email}
        />
        <br />
        <label htmlFor="phone">Phone : </label>
        <input
          type="tel"
          id="phone"
          name="phone"
          onChange={handleChange}
          value={phone}
        />
        <br />
        <label htmlFor="password">Password : </label>
        <input
          type="password"
          name="password"
          id="password"
          onChange={handleChange}
          value={password}
        />
        <br />
        <input type="submit" value="Submit" />
      </form>
    </div>
  );
};

export default UserData;
