package edu.nps.moves.dis7.entities.deu.platform.surface;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * SISO-REF-010-v28 (2020-05-07)
 * name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$SpecificElem@3eb77ea8;
 * Country: Germany (DEU);
 * Entity kind: Platform;
 * Domain: SURFACE;
 *
 * Entity type uid: 16623
 */
public class A1417Offenburg extends EntityType
{
    /** Default constructor */
    public A1417Offenburg()
    {
        setCountry(Country.GERMANY_DEU);
        setEntityKind(EntityKind.PLATFORM);
        setDomain(Domain.inst(PlatformDomain.SURFACE));

        setCategory((byte)16); // uid 16594, Auxiliary
        setSubCategory((byte)6); // uid 16617, Luneburg class (type 701, support ships)
        setSpecific((byte)6); // uid 16623, A 1417 Offenburg
    }
}
