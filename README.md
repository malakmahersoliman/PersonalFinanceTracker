#  Personal Finance Tracker

A beginner-friendly Android app with two screens — built to help users log and share personal expenses. Designed using clean XML layouts, proper resource management, and Android best practices.

---

##  Features

-  **Welcome Screen** with a friendly message
- ➡ **Track Expense** button launches the expense form
-  **Share** button uses implicit intent to share sample expense
-  **Expense Form** with fields for name, amount, and category
-  **Save Button** with simple Toast confirmation
-  **Lifecycle Logging** using `Log.d()` in both activities
-  XML-only layout using `ConstraintLayout` and `LinearLayout` nesting
-  Clean use of resources: `strings.xml`, `colors.xml`, `dimens.xml`
-  APK included for installation and demo

---

##  Screens (2)

1. **MainActivity**
   - Welcome TextView
   - Track Expense button (explicit intent)
   - Share button (implicit intent)
2. **FinanceActivity**
   - EditTexts for expense name, amount, category
   - Save button (UI only)
   - Optional Back button
   - Lifecycle logs

---

##  Screenshots
<img width="1080" height="2400" alt="MainActivity" src="https://github.com/user-attachments/assets/501b8355-4221-4bbf-92ec-6c8761297684" />
<img width="1080" height="2400" alt="FinanceActivity" src="https://github.com/user-attachments/assets/00a44a06-8655-4c0d-bdd3-3ffbf7ccaa00" />



---
##  Tech Stack

| Tool             | Purpose                                |
|------------------|----------------------------------------|
| Kotlin           | Primary programming language           |
| Android SDK      | Core platform for Android development  |
| ConstraintLayout | Used as the root layout in all screens |
| LinearLayout     | Nested layout groups for UI sections   |
| Intents          | Explicit (navigation) & Implicit (share) |
| Logcat           | Lifecycle method logging (`Log.d`)     |
| Gradle           | Project build system and dependency management |

---

##  Team Collaboration

This project was built collaboratively by a team of five, with each member contributing to different features and sections of the app. We divided tasks, shared knowledge, reviewed each other's code, and integrated everything using Git and Android Studio.

| Team Member         | Role / Contributions                                 |
|---------------------|------------------------------------------------------|
| **Malak Maher**     | Project lead, GitHub repo setup, navigation logic    |
| **Aya Ayman**       | UI design, layout styling, `dimens.xml` management   |
| **Karim Yasser**    | Lifecycle logging, MainActivity Kotlin implementation |
| **Merna Waild**     | Input validation, FinanceActivity logic, back button |
| **Ramez Karam**     | Share intent, README documentation, APK testing      |

We used Git branching and task-based commits to keep our work clean and collaborative.

---

##  What We Learned

- How to build a two-screen Android app using Kotlin and XML
- The structure and behavior of Android Activity lifecycle (`onCreate`, `onStart`, etc.)
- The difference between **explicit** and **implicit** intents
- How to design clean, organized UI with `ConstraintLayout` and resource files
- Collaborating efficiently in a team using Git and GitHub
- Managing project structure, Gradle builds, and APK generation
