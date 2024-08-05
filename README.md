# jetbrains-dim-night-theme

A dark theme for JetBrains IDEs that provides a dim, night-friendly color scheme for comfortable coding in low-light environments.

<!-- Plugin description -->
Dim Night Theme is a carefully crafted dark color scheme designed for JetBrains IDEs. It offers a soothing, low-contrast palette that reduces eye strain during late-night coding sessions or in dimly lit environments. With its thoughtfully selected colors, this theme enhances code readability while maintaining a professional and elegant look. Perfect for developers who prefer a darker, more subdued coding environment without sacrificing clarity or aesthetics.
<!-- Plugin description end -->

## Installation

As this plugin is not yet published to the JetBrains Marketplace, you'll need to build it manually and install it from a local file.

### Prerequisites

- Java Development Kit (JDK) 17
- Git

### Building the Plugin

1. Clone the repository.

2. Navigate to the project directory:

   ```
   cd jetbrains-dim-night-theme
   ```

3. Build the project using Gradle:

   ```
   ./gradlew build
   ```

4. The built plugin will be located in the `build/distributions` directory.

### Installing the Plugin

1. Open your JetBrains IDE.
2. Go to `Settings/Preferences` > `Plugins`.
3. Click the gear icon (⚙️) and select `Install Plugin from Disk...`.
4. Navigate to the `build/distributions` directory in the project folder.
5. Select the `.zip` file (it should be named something like `jetbrains-dim-night-theme-0.0.3.zip`).
6. Click `OK` and restart your IDE when prompted.

## Usage

After installation:

1. Go to `Settings/Preferences` > `Appearance & Behavior` > `Appearance`.
2. In the `Theme` dropdown, select "Dim Night".
3. Click `Apply` and then `OK`.

## Compatibility

Supported versions: 2021.1 (Build 211) to 2024.1 (Build 241.*)

## License

This project is licensed under the [MIT License](LICENSE).

## Note

This plugin is currently in development and not yet available on the JetBrains Marketplace. Installation requires manual building and installation as described above.
