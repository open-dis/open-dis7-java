package edu.nps.moves.dis7.entities.ita.platform.surface;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * SISO-REF-010-v28 (2020-05-07)
 * name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$SpecificElem@3e7634b9;
 * Country: Italy (ITA);
 * Entity kind: Platform;
 * Domain: SURFACE;
 *
 * Entity type uid: 22715
 */
public class D553AndreaDoria extends EntityType
{
    /** Default constructor */
    public D553AndreaDoria()
    {
        setCountry(Country.ITALY_ITA);
        setEntityKind(EntityKind.PLATFORM);
        setDomain(Domain.inst(PlatformDomain.SURFACE));

        setCategory((byte)4); // uid 18334, Guided Missile Destroyer (DDG)
        setSubCategory((byte)3); // uid 22714, Andrea Doria (Horizon) Class
        setSpecific((byte)1); // uid 22715, D553 Andrea Doria
    }
}
