package edu.nps.moves.dis7.entities.ita.platform.surface;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * SISO-REF-010-v28, 2020-05-07
 * name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$SpecificElem@3829ac1
 * Country: Italy (ITA)
 * Entity kind: Platform
 * Domain: SURFACE
 *
 * Entity type uid: 18546
 */
public class Y485RP132 extends EntityType
{
    public Y485RP132()
    {
        setCountry(Country.ITALY_ITA);
        setEntityKind(EntityKind.PLATFORM);
        setDomain(Domain.inst(PlatformDomain.SURFACE));

        setCategory((byte)16); // uid 18374, Auxiliary
        setSubCategory((byte)24); // uid 18516, Harbour Tug
        setSpecific((byte)30); // uid 18546, Y485 RP 132
    }
}
