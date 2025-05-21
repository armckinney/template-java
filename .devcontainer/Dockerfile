FROM armck/java:21

# set workspace directory
ARG WORKSPACE=/workspaces/template-java
ENV WORKSPACE=${WORKSPACE}

# avoid warnings by switching to noninteractive
ENV DEBIAN_FRONTEND=noninteractive

RUN mkdir /tmp/container && cd /tmp/container \
    # primarvn installs
    && apt-get update && apt-get install -y \
        maven \
    # cleanup
    && apt autoremove -y \
    && apt clean -y \
    && rm -rf /var/lib/apt/lists/* \
    && rm -rf /tmp/container

WORKDIR ${WORKSPACE}

# switch back to dialog for any ad-hoc use of apt
ENV DEBIAN_FRONTEND=dialog
