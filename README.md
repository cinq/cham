# Cinq's Hadoop Application Monitoring

Monitoring application results is a bit trickier than monitoring that some services are up and working.

You can monitor with
* Logs
* Output
* Return code

## Logs

Contains how and what the running application did. There can be pattern that we want to see and patterns that means that some processing did not work as expected.

## Output

The application is running to produce some results that we expect. We can look at different aspects of the output to determine if the application completed the tasks as expected.
* Size of the output
* Output patterns
* System state that changed

## Return Code

Typically when the application returns a zero as the return code we expect that everything worked normally. A non-zero return code means that something went wrong. 
