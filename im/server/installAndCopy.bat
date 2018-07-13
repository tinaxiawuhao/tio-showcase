call mvn clean install

call rd ..\..\..\..\dist\examples\im\server /s /q
call xcopy target\dist\tio-examples-im-server-3.1.2.v20180712-RELEASE ..\..\..\..\dist\examples\im\server\ /s /e /q /y

