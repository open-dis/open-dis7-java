package edu.nps.moves.dis7.entities.usa.munition.antipersonnel;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * SISO-REF-010-v28 (2020-05-07)
 * name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$SpecificElem@6fc1a8f6;
 * Country: United States of America (USA);
 * Entity kind: Munition;
 * Domain: ANTI_PERSONNEL;
 *
 * Entity type uid: 19855
 */
public class Special extends EntityType
{
    /** Default constructor */
    public Special()
    {
        setCountry(Country.UNITED_STATES_OF_AMERICA_USA);
        setEntityKind(EntityKind.MUNITION);
        setDomain(Domain.inst(MunitionDomain.ANTI_PERSONNEL));

        setCategory((byte)2); // uid 19810, Ballistic
        setSubCategory((byte)12); // uid 19852, .38 Cal
        setSpecific((byte)3); // uid 19855, Special
    }
}
