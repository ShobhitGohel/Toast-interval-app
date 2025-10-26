# 📱 Assignment 6 — Toast Interval App

## 🧩 Overview
This Android app demonstrates how to display **repeated Toast messages** at fixed intervals using a **Handler** and **Runnable**.  
It’s a simple example showing how to perform timed tasks on the main thread without freezing the UI.

---

## ⚙️ Features
- Displays a **Toast message every 1 second**.  
- Uses **Handler + Runnable** for timed task execution.  
- Automatically stops the repeating messages when the Activity is destroyed.  
- Minimal UI with a simple title text.

---

## 🧠 Key Concepts
- **Handler** → Schedules and manages tasks on the main thread.  
- **Runnable** → Contains the logic that repeats periodically.  
- **Looper.getMainLooper()** → Ensures execution on the UI thread.  
- **postDelayed()** → Re-schedules a task after a given delay.  
- **removeCallbacks()** → Prevents memory leaks when the activity closes.

---

## ▶️ App Flow
1. The `Handler` posts a `Runnable` to the main thread.  
2. The `Runnable` displays a Toast message.  
3. It re-schedules itself every 1 second using `postDelayed()`.  
4. When the Activity is destroyed, all scheduled tasks are stopped.

---

## 🧱 UI Layout
A single-screen layout with a centered title text —  
**“Toast Interval App”** on a white background.

---

## 🧰 Tech Stack
- **Language:** Kotlin  
- **Framework:** Android SDK  
- **Minimum SDK:** 21+  

---

## 🧹 Cleanup Mechanism
The app uses `handler.removeCallbacks()` in `onDestroy()` to stop all pending tasks, ensuring **no memory leaks** or background toasts after the app closes.

---

## 🧩 Output
- Repeated Toast message —  
  `"This is a Toast Message!"` shown **every 1 second** continuously until the app is closed.

---

## 👨‍💻 Author
**ShobhU**  
*College Student | Android Developer in Progress | Passionate about Clean and Functional Code*
