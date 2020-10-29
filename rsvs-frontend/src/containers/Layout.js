import React from 'react';
import { Container, Row, Col } from 'react-bootstrap';

export const Layout = (props) => {
    return <Container>
        {props.children}
    </Container>
}