# mfp-extension-adapters

MFP Extension Adapters for Watson Congnitive Services such as Watson Conversation, Watson Natural Language Understanding and Watson Discovery. Using these MobleFirst Platform Adapters customer can quickly build a cognitive mobile apps and leverage IBM MobileFirst Platform capabilities

# Pre-built Adapters

The pre-built adapters for each of the Watson Cognitive Service can be found in the respective watson service
discovery. These adapters can be downloaded and deployed to MFP Server to be used in the mobile app.

# Building the Adapters

Clone the repository and go to the respective Watson Service Directory and run the command :

mvn clean install

This command will build the adapter and it will be available under the "target" folder. This adapter
can be deployed on to a MFP Server and used in the mobile applications.
