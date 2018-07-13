call mvn clean install

call rd ..\..\..\..\dist\examples\im\client /s /q
call xcopy target\dist\tio-examples-im-client-3.1.2.v20180712-RELEASE ..\..\..\..\dist\examples\im\client\ /s /e /q /y

