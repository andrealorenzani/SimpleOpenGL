package name.lorenzani.andrea.SimpleOpenGL.frames

import com.jogamp.opengl.{GLCapabilitiesImmutable, GLEventListener}

object FrameType extends Enumeration {
  type FrameType = Value
  val Swing, Awt = Value
}

object FrameFactory {
  import name.lorenzani.andrea.SimpleOpenGL.frames.FrameType.FrameType

  def startFrame(capabilities: GLCapabilitiesImmutable,
                 eventListener: GLEventListener,
                 frameType: FrameType = FrameType.Swing): BaseFrame = {
    frameType match {
      case FrameType.Swing => new SwingFrame(capabilities, eventListener)
      case FrameType.Awt => new AwtFrame(capabilities, eventListener)
    }
  }
}
