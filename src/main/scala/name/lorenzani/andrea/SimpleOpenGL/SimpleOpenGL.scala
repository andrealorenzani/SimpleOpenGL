package name.lorenzani.andrea.SimpleOpenGL

import com.jogamp.opengl.{GLCapabilities, GLCapabilitiesImmutable, GLProfile}
import name.lorenzani.andrea.SimpleOpenGL.frames.FrameFactory
import name.lorenzani.andrea.SimpleOpenGL.frames.framelisteners.BasicFrameListener

// Starting point: https://www.tutorialspoint.com/jogl/jogl_canvas_with_awt.htm
object SimpleOpenGL extends App {

  //getting the capabilities object of GL2 profile
  val profile: GLProfile = GLProfile.get(GLProfile.GL2)
  val capabilities: GLCapabilitiesImmutable = new GLCapabilities(profile)

  // We create a Frame (the default third parameter is a SWING frame)
  val frame = FrameFactory.startFrame(capabilities, new BasicFrameListener())

  // We show the frame
  frame.show
}
