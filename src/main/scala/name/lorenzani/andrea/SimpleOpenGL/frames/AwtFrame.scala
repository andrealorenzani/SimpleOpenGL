package name.lorenzani.andrea.SimpleOpenGL.frames

import java.awt.{Frame => AwtNativeFrame}

import com.jogamp.opengl.awt.{GLCanvas => AwtGlCanvas}
import com.jogamp.opengl.{GLCapabilitiesImmutable, GLEventListener}

class AwtFrame(capabilities: GLCapabilitiesImmutable,
               eventListener: GLEventListener) extends BaseFrame {

  private def startAwtFrame: AwtNativeFrame = {

    // The canvas
    val awtglcanvas: AwtGlCanvas = new AwtGlCanvas(capabilities)
    awtglcanvas.addGLEventListener(eventListener)
    awtglcanvas.setSize(400, 400)

    //creating frame
    val frame: AwtNativeFrame = new AwtNativeFrame (" Basic Frame")

    //adding canvas to frame
    frame.add(awtglcanvas)
    frame.setSize( 640, 480 )
    frame
  }

  lazy val frame: AwtNativeFrame = startAwtFrame
  override def show: Unit =  frame.setVisible(true)
}
