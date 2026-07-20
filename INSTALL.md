# Installation Guide — Java + VS Code

Complete this before Day 1. Budget 30–60 minutes. Every step has a
"verify" check — don't move on until the check passes.

📺 Watch-along video: [Run Java program in VS Code](https://www.youtube.com/watch?v=kt3wUPIDkx4)
(the steps below follow the same flow).

---

## Step 1 — Install the JDK (the Java compiler + runtime)

1. Go to https://adoptium.net/
2. Download **Temurin 17 (LTS)** or newer for your operating system.
3. Run the installer. On Windows, tick **"Set JAVA_HOME variable"** and
   **"Add to PATH"** if the installer offers them.

**Verify** — open a NEW terminal (Terminal app on Mac; PowerShell on Windows):
```bash
java --version
javac --version
```
Both must print a version (17 or higher). If you get "command not found",
the PATH isn't set — reinstall with the PATH option ticked, or ask for help
now, not on Day 1.

## Step 2 — Install git

- **Mac:** run `git --version` in Terminal — macOS will offer to install the
  developer tools if git is missing. Accept.
- **Windows:** download from https://git-scm.com/download/win and install with
  the default options.

**Verify:** `git --version` prints a version.

## Step 3 — Install Visual Studio Code

Download from https://code.visualstudio.com/ and install.

## Step 4 — Install the Extension Pack for Java

This one extension pack gives you everything: syntax highlighting, code
completion (non-AI), the debugger, the test runner, and Maven support.

1. Open VS Code.
2. Click the **Extensions** icon in the left sidebar (four squares), or press
   `Ctrl+Shift+X` (Mac: `Cmd+Shift+X`).
3. Search for **"Extension Pack for Java"** — pick the one by **Microsoft**
   (id: `vscjava.vscode-java-pack`).
4. Click **Install**. It installs six extensions in one go:
   - Language Support for Java (Red Hat)
   - Debugger for Java
   - Test Runner for Java
   - Maven for Java
   - Project Manager for Java
   - IntelliCode — **disable this one** (right-click → Disable): it's
     AI-assisted completion, which the bootcamp rules don't allow. Plain
     completion from the Red Hat extension is fine and stays on.

**Verify:** the Extensions sidebar shows "Extension Pack for Java" as installed.

## Step 5 — Get your copy of the bootcamp repo

Follow the "One-time setup" section of [README.md](README.md):
**Use this template → create your private repo → add your mentor → clone it.**

Then in VS Code: **File → Open Folder…** and select the cloned folder.

- When VS Code asks **"Do you trust the authors of the files in this
  folder?"** → click **Yes, I trust the authors**.
- Bottom-right you'll see "Importing projects…" — VS Code has found
  `pom.xml` and is setting up the Java project. Wait for it to finish
  (first time takes a few minutes).

**Verify:** open `src/main/java/day01/Hello.java`. Within a few seconds you
should see a small **Run | Debug** link floating above the `main` method.

## Step 6 — Run your first program

1. In `Hello.java`, click **Run** above `main`.
2. A terminal panel opens and prints `Hello, Bootcamp!`

That Run button is a convenience. On Day 1 you'll also compile and run this
same file from the terminal with `javac`/`java` — required, so you understand
what the button hides.

## Step 7 — Run the tests (two ways — learn both)

**From the terminal** (VS Code menu: Terminal → New Terminal):
```bash
./mvnw test -Dtest="day01.*Test"        # Mac/Linux
mvnw.cmd test -Dtest="day01.*Test"      # Windows
```
The first run downloads dependencies for a few minutes. Expect **FAILURES** —
the exercises aren't implemented yet. Failing is the correct starting state;
your job for two weeks is turning these red tests green.

**From the editor:** click the **beaker/flask icon** in the left sidebar
(Testing view). You'll see every day's tests in a tree. Click the ▶ next to
`day01` to run just those. Red ✗ = not done, green ✓ = done.

**Verify:** `WarmupTest` runs and fails with
`UnsupportedOperationException: TODO: implement me`. Setup complete. 🎉

---

## Troubleshooting

| Symptom | Fix |
|---|---|
| `java: command not found` after install | Close and reopen the terminal. Still broken → PATH wasn't set during JDK install; reinstall with that option. |
| VS Code says "Java runtime not found" | `Ctrl+Shift+P` → "Java: Configure Java Runtime" → point it at your installed JDK. |
| No Run/Debug link above `main` | Wait for the import to finish (spinner in the bottom bar). Then `Ctrl+Shift+P` → "Java: Clean Java Language Server Workspace" → Reload. |
| `./mvnw: Permission denied` (Mac/Linux) | Run `chmod +x mvnw` once in the repo folder. |
| `mvnw` download errors | You need internet for the first run (it fetches Maven + libraries). Check your connection/proxy. |
| Testing sidebar is empty | Open any test file once (e.g. `src/test/java/day01/WarmupTest.java`), then reopen the Testing view. |

Stuck on setup for more than 45 minutes? That's the same 45-minute rule as the
bootcamp: write down what you tried and message your mentor. Setup problems
are normal and not a bad start.

---

## Prefer IntelliJ IDEA instead?

IntelliJ IDEA Community Edition (https://www.jetbrains.com/idea/download/ —
scroll to the free Community Edition) also works: **Open** the cloned folder,
it auto-imports the Maven project, and green ▶ icons appear next to tests.
Disable any AI assistant plugins per the bootcamp rules. Everything else in
this guide (JDK, git, cloning) is identical.
