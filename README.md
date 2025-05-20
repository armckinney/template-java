<!-- header -->
<div align="center">
    <p>
    <!-- Header -->
        <img width="100px" src="./ini/readme_logo.png"  alt="template-java" />
        <h2>template-java</h2>
        <p><i>cool-template-java-tagline</i></p>
    </p>
    <p>
    <!-- Shields -->
        <a href="https://github.com/armckinney/template-java/LICENSE">
            <img alt="License" src="https://img.shields.io/github/license/armckinney/template-java.svg" />
        </a>
        <a href="https://github.com/armckinney/template-java/actions">
            <img alt="Tests Passing" src="https://github.com/armckinney/template-java/workflows/CI/badge.svg" />
        </a>
        <a href="https://codecov.io/gh/armckinney/template-java">
            <img alt="Code Coverage" src="https://codecov.io/gh/armckinney/template-java/branch/master/graph/badge.svg" />
        </a>
        <a href="https://github.com/armckinney/template-java/issues">
            <img alt="Issues" src="https://img.shields.io/github/issues/armckinney/template-java" />
        </a>
        <a href="https://github.com/armckinney/template-java/pulls">
            <img alt="GitHub pull requests" src="https://img.shields.io/github/issues-pr/armckinney/template-java" />
        </a>
        <a href="https://stackshare.io/armck/template-java">
            <img alt="StackShare.io" src="http://img.shields.io/badge/tech-stack-0690fa.svg?label=StackShare.io">
        </a>
    </p>
    <p>
    <!-- Links -->
        <a href="https://github.com/armckinney/template-java/issues/new/choose">Report Bug</a>
        ·
        <a href="https://github.com/armckinney/template-java/issues/new/choose">Request Feature</a>
    </p>
</div>
<br>
<br>

<!-- Description -->
Here is where you can you a much longer description of your project. You might include features and inspiration here.

The `template-java` repository adds some nifty and time-saving features like:
- *All of the benefits of [template-ubuntu](https://github.com/armckinney/template-ubuntu) PLUS..*
- JDK Installation
- C# Extension
- Azure Container App Deployment


### Quick Start

1. ###### Add DockerHub Secrets:
Add `DOCKER_HUB_ID` & `DOCKER_HUB_ACCESS_TOKEN` to GitHub repository. This will allow you to benefit from the build/push workflows in [ci.yml](./.github/workflows/ci.yml).

![](./ini/dockerhub_example.png)

2. ###### Configure the init script:
This will allow you make quick changes to the template files that format them specifically for your project.
Do this by filling out the `.\ini\config\config.ini.json` with your own preferences.

3. ###### Run the init script:
This will allow you to auto-magically replace the `template-repo` name in the template files as well as configure the `ProjectLogo` image.

```powershell
./Initialize-TemplateRepository.ps1
```

*Note:* The project parent directory should match the GitHub project name.

4. ###### Clean up what you don't want:
Some items you might want to get rid of/update:
- `./ini/` directory and its contents
- Description, Quick Start, and Usage in this `README` file
- The lint / test jobs in `..github/workflows/ci.yml`

5. ###### Commit and Push your changes to GitHub:
This should update all of your badges, links, images, as well as run the inital CI workflow.


### Usage

It's as simple as making a new repository from this one and then follow the steps in the [Quick Start](#quick-start) section!
