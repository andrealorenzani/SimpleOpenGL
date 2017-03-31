package name.lorenzani.andrea.SimpleOpenGL.frames.framelisteners

import com.jogamp.opengl.{GLAutoDrawable, GLEventListener}

class BasicFrameListener extends GLEventListener {
  override def init(drawable: GLAutoDrawable): Unit = {}

  override def display(drawable: GLAutoDrawable): Unit = {}

  override def reshape(drawable: GLAutoDrawable, x: Int, y: Int, width: Int, height: Int): Unit = {}

  override def dispose(drawable: GLAutoDrawable): Unit = {}
}
