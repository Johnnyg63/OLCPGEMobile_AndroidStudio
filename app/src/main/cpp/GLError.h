//////////////////////////////////////////////////////////////////
// Pixel Game Engine Mobile 2.2.2                               //
// John Galvin aka Johnngy63: 14-Nov-2023                       //
// Full production release                                      //
// Please report all bugs to https://discord.com/invite/WhwHUMV //
// Or on Github: https://github.com/Johnnyg63					//
//////////////////////////////////////////////////////////////////

#ifndef OLCASTEMPLATE_GLERROR_H
#define OLCASTEMPLATE_GLERROR_H

void _check_gl_error(const char *file, int line);

///
/// Usage
/// [... some opengl calls]
/// glCheckError();
///
#define check_gl_error() _check_gl_error(__FILE__,__LINE__)


#endif //OLCASTEMPLATE_GLERROR_H
