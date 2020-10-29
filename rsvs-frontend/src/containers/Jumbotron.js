import React from 'react';
import { Jumbotron as Jumbo, Container } from 'react-bootstrap';
import styled from 'styled-components';

const Styles = styled.div`
    .jumbo {
        background
    }
`;

export const Jumbotron = () => (
    <Styles>
        <Jumbo fluid className="jumbo">
            <div className="overlap"></div>
            <Container>
                <h1>Welcome</h1>
                <p>Learn to code</p>
            </Container>
        </Jumbo>
    </Styles>
)