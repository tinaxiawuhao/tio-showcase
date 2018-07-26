call mvn clean install

call rd ..\..\..\..\dist\examples\im\server /s /q
call xcopy target\dist\tio-examples-im-server-3.1.4.v20180726-RELEASE ..\..\..\..\dist\examples\im\server\ /s /e /q /y

