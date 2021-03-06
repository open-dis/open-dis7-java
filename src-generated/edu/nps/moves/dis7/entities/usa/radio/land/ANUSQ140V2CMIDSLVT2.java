package edu.nps.moves.dis7.entities.usa.radio.land;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * SISO-REF-010-v28 (2020-05-07)
 * name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$SpecificElem@54e0f76f;
 * Country: United States of America (USA);
 * Entity kind: Radio;
 * Domain: LAND;
 *
 * Entity type uid: 26796
 */
public class ANUSQ140V2CMIDSLVT2 extends EntityType
{
    /** Default constructor */
    public ANUSQ140V2CMIDSLVT2()
    {
        setCountry(Country.UNITED_STATES_OF_AMERICA_USA);
        setEntityKind(EntityKind.RADIO);
        setDomain(Domain.inst(PlatformDomain.LAND));

        setCategory((byte)21); // uid 26793, Link 16 Terminal
        setSubCategory((byte)1); // uid 26794, Joint Electronics Type Designation System (JETDS) Non-specific Series
        setSpecific((byte)12); // uid 26796, AN/USQ-140(V)2(C) MIDS LVT(2)
    }
}
