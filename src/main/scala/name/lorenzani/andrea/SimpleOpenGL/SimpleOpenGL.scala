package name.lorenzani.andrea.SimpleOpenGL

import java.awt.Frame

import com.jogamp.opengl.{GLCapabilities, GLCapabilitiesImmutable, GLProfile}
import com.jogamp.opengl.awt.GLCanvas
import name.lorenzani.andrea.SimpleOpenGL.frames.BasicFrame

object SimpleOpenGL extends App {

  //getting the capabilities object of GL2 profile
  val profile: GLProfile = GLProfile.get(GLProfile.GL2)
  val capabilities: GLCapabilitiesImmutable = new GLCapabilities(profile)

  // The canvas
  val glcanvas: GLCanvas = new GLCanvas(capabilities)
  val b: BasicFrame = new BasicFrame()
  glcanvas.addGLEventListener(b)
  glcanvas.setSize(400, 400)

  //creating frame
  val frame: Frame = new Frame (" Basic Frame")

  //adding canvas to frame
  frame.add(glcanvas)
  frame.setSize( 640, 480 )
  frame.setVisible(true)

}
