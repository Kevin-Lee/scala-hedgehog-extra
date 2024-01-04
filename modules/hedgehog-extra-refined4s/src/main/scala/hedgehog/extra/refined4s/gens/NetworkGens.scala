package hedgehog.extra.refined4s.gens

import hedgehog.*
import refined4s.types.all.*

/** @author Kevin Lee
  * @since 2022-12-11
  */
trait NetworkGens {
  def genPortNumber: Gen[PortNumber] =
    Gen
      .int(Range.linear(0, 65535))
      .map(PortNumber.unsafeFrom)

  def genSystemPortNumber: Gen[SystemPortNumber] =
    Gen
      .int(Range.linear(0, 1023))
      .map(SystemPortNumber.unsafeFrom)

  def genUserPortNumber: Gen[UserPortNumber] =
    Gen
      .int(Range.linear(1024, 49151))
      .map(UserPortNumber.unsafeFrom)

  def genDynamicPortNumber: Gen[DynamicPortNumber] =
    Gen
      .int(Range.linear(49152, 65535))
      .map(DynamicPortNumber.unsafeFrom)

  def genNonSystemPortNumber: Gen[NonSystemPortNumber] =
    Gen
      .int(Range.linear(1024, 65535))
      .map(NonSystemPortNumber.unsafeFrom)

}
object NetworkGens extends NetworkGens
