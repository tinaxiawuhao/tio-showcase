call mvn clean install

call rd ..\..\..\..\dist\examples\im\client /s /q
call xcopy target\dist\tio-examples-im-client-3.1.4.v20180726-RELEASE ..\..\..\..\dist\examples\im\client\ /s /e /q /y

