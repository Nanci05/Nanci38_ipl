<!DOCTYPE html>
<html>
<head>
    <title>Create Profile</title>
  <style>
  @import url('https://fonts.googleapis.com/css?family=Poppins:400,500,600,700,800,900');

  body {
    font-family: 'Poppins', sans-serif;
    font-weight: 300;
    font-size: 15px;
    line-height: 1.7;
    color: #c4c3ca;
    background-color: #ffffff;
    overflow-x: hidden;
  }

  form {
    color: black;
  }

  .card {
    position: absolute;
    top: 50%;
    left: 50%;
    transform: translate(-50%, -50%);
    background-color: transparent;
    border-radius: 8px;
    border-color: goldenrod;
    box-shadow: 0 4px 8px rgba(0, 0, 0, 0.2);
    padding: 16px;
    max-width: 500px;
    width: 100%;
    justify-content: center;
    align-content: center;
    align-items: center;
  }

    .ncard {
    position: absolute;
    top: 80%;
    left: 50%;
    transform: translate(-50%, -50%);
    background-color: transparent;
    border-radius: 8px;
    border-color: goldenrod;
    box-shadow: 0 4px 8px rgba(0, 0, 0, 0.2);
    padding: 16px;
    max-width: 500px;
    width: 100%;
    justify-content: center;
    align-content: center;
    align-items: center;
  }

  .card h1 {
    margin-top: 0;
    font-size: 28px;
    color: #fff;
  }

  .card p {
    color: #fff;
  }
  </style>

</head>
<body>
 
    <form action="registration.php" method="post">
        <center><h1>Online Airlines Registration</h1></center>
        <h1>Details</h1>
  <label for="id">RatingPoints:</label>
  <input type="text" id="RatingPoints" name="RatingPoints"  ><br>

  <label for="name">Name:</label>
  <input type="text" id="name" name="name" ><br>

  <label for="email">Email:</label>
  <input type="text" id="email" name="email" ><br>

  <label for="pass">Password:</label>
  <input type="password" id="pass" name="pass"><br>

  <label for="country">Country:</label>
  <input type="text" id="country" name="country" ><br>

  <label for="city">City:</label>
  <input type="text" id="city" name="city"><br>

  <label for="contact">Contact:</label>
  <input type="text" id="contact" name="contact"><br>

  <label for="address">Address:</label>
  <textarea id="address" name="address"></textarea><br>

  <input type="submit" value="Submit">
</form>
</body>
</html>