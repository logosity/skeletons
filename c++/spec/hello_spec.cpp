#include "catch.hpp"
#include "hello.h"

TEST_CASE("Hello returns forty-two", "[hello]") {
  REQUIRE(hello() == 42);
}


