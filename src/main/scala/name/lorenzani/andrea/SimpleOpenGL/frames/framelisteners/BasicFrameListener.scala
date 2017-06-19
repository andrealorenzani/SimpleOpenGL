/***
*   Copyright 2017 Andrea Lorenzani
*
*   Licensed under the Apache License, Version 2.0 (the "License");
*   you may not use this file except in compliance with the License.
*   You may obtain a copy of the License at
*
*       http://www.apache.org/licenses/LICENSE-2.0
*
*   Unless required by applicable law or agreed to in writing, software
*   distributed under the License is distributed on an "AS IS" BASIS,
*   WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
*   See the License for the specific language governing permissions and
*   limitations under the License.
*
***/

package name.lorenzani.andrea.SimpleOpenGL.frames.framelisteners

import java.nio.{Buffer, IntBuffer}

import com.jogamp.opengl.{GL, GL4, GLAutoDrawable, GLEventListener}

class BasicFrameListener extends GLEventListener {
  // https://drive.google.com/file/d/0B9hhZie2D-fEYTFiMmFiYzQtMDA0MC00ZWI0LWI1NjItODE3ZjM2OGUxOWEw/view

  override def init(drawable: GLAutoDrawable): Unit = {}

  override def display(drawable: GLAutoDrawable): Unit = {
    val gl: GL4 = drawable.getGL().getGL4();

    val points = List[Float](0.0f,  0.5f,  0.0f, 0.5f, -0.5f,  0.0f, -0.5f, -0.5f,  0.0f)
    val buf = Buffer
    var ibuff: Array[Int] = new Array[Int](9)

    gl.glGenBuffers(1, ibuff, 9)
    gl.glBindBuffer(GL.GL_ARRAY_BUFFER, 1)
    gl.glBufferData(GL.GL_ARRAY_BUFFER, 9, )
  }

  override def reshape(drawable: GLAutoDrawable, x: Int, y: Int, width: Int, height: Int): Unit = {}

  override def dispose(drawable: GLAutoDrawable): Unit = {}
}
