# Cinq's Hadoop Application Monitoring

Monitoring application results is a bit trickier than monitoring that some services are up and working.

You can monitor with
* Logs
* Output
* Return code


## Logs

Contains how and what the running application did. There can be pattern that we want to see and patterns that means that
some processing did not work as expected.

### Retrieve

* ssh
* file system (includes NFS mount)

### Type

* Hadoop
* Application
    * driver
    * executor

### Pattern Matching

Regex is a way to have pattern matching but can it do multiple lines?
TODO: Regex for multiple line patterns

* Pattern for success
* Pattern for failure

### Exceptions

Since Hadoop is a Java based application there is a lot of exception that can happen and we need to know what to do
with those.

## Output

The application is running to produce some results that we expect. We can look at different aspects of the output to
determine if the application completed the tasks as expected.

* Size of the output
* Output patterns
* System state that changed


## Return Code

Typically when the application returns a zero as the return code we expect that everything worked normally. A non-zero
return code means that something went wrong. Yarn will mark a job failed if it has returned anything else than a zero.

TODO: Find example where this is not happening and figure out why
