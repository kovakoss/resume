<!DOCTYPE html>
<html lang="en">

<head>
  <meta charset="UTF-8">
  <meta name="viewport" content="width=device-width, initial-scale=1.0">
  <title>Your CV</title>

  <style>
    body {
      font-family: Arial, sans-serif;
      background-color: #f4f4f4;
      margin: 0;
      padding: 0;
    }

    header {
      background-color: #333;
      color: white;
      padding: 1em;
      text-align: center;
    }

    section {
      max-width: 800px;
      margin: 20px auto;
      padding: 20px;
      background-color: white;
      box-shadow: 0 0 10px rgba(0, 0, 0, 0.1);
      border-radius: 5px;
    }

    h2 {
      color: #333;
    }

    button {
      background-color: #4CAF50;
      color: white;
      padding: 10px 15px;
      border: none;
      border-radius: 4px;
      cursor: pointer;
    }

    /* Pop-up styling */
    .popup {
      display: none;
      position: fixed;
      top: 50%;
      left: 50%;
      transform: translate(-50%, -50%);
      padding: 20px;
      background-color: #fff;
      box-shadow: 0 0 20px rgba(0, 0, 0, 0.2);
      z-index: 1;
    }

    .overlay {
      display: none;
      position: fixed;
      top: 0;
      left: 0;
      width: 100%;
      height: 100%;
      background: rgba(0, 0, 0, 0.5);
      z-index: 0;
    }
  </style>
</head>

<body>

  <header>
    <h1>Your Name - Curriculum Vitae</h1>
  </header>

  <section>
    <h2>About Me</h2>
    <p>Write a brief introduction about yourself.</p>

    <h2>Education</h2>
    <p>Include details about your educational background.</p>

    <h2>Work Experience</h2>
    <p>Highlight your work experience and achievements.</p>

    <h2>Skills</h2>
    <p>List your key skills and strengths.</p>

    <button onclick="showPopup()">View Contact Information</button>
  </section>

  <!-- Contact Information Popup -->
  <div id="contactPopup" class="popup">
    <p>Contact Information:</p>
    <p>Email: your.email@example.com</p>
    <p>Phone: (555) 123-4567</p>
    <button onclick="hidePopup()">Close</button>
  </div>

  <!-- Overlay for the Popup -->
  <div id="overlay" class="overlay"></div>

  <script>
    function showPopup() {
      document.getElementById("contactPopup").style.display = "block";
      document.getElementById("overlay").style.display = "block";
    }

    function hidePopup() {
      document.getElementById("contactPopup").style.display = "none";
      document.getElementById("overlay").style.display = "none";
    }
  </script>

</body>

</html>