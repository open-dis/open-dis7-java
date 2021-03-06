package edu.nps.moves.dis7.entities.grc.platform.surface;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * SISO-REF-010-v28 (2020-05-07)
 * name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$SpecificElem@7331196b;
 * Country: Greece (GRC);
 * Entity kind: Platform;
 * Domain: SURFACE;
 *
 * Entity type uid: 23360
 */
public class L177Rodos extends EntityType
{
    /** Default constructor */
    public L177Rodos()
    {
        setCountry(Country.GREECE_GRC);
        setEntityKind(EntityKind.PLATFORM);
        setDomain(Domain.inst(PlatformDomain.SURFACE));

        setCategory((byte)10); // uid 23354, Tank Landing Ship
        setSubCategory((byte)1); // uid 23355, Jason class
        setSpecific((byte)5); // uid 23360, L177 Rodos
    }
}
