import sure
import asynctest

from asynctest.mock import Mock, MagicMock, PropertyMock, ANY, DEFAULT
import app.lib.hello as hello

class TestHello(asynctest.TestCase):
    async def setUp(self):
        pass

    async def test_hello(self):
        hello.hello().should.equal('world')
