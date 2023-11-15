//
// Created by jgalv on 05/11/2023.
//

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
