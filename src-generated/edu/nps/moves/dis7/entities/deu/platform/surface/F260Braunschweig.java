package edu.nps.moves.dis7.entities.deu.platform.surface;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * SISO-REF-010-v28 (2020-05-07)
 * name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$SpecificElem@4ff8d125;
 * Country: Germany (DEU);
 * Entity kind: Platform;
 * Domain: SURFACE;
 *
 * Entity type uid: 24115
 */
public class F260Braunschweig extends EntityType
{
    /** Default constructor */
    public F260Braunschweig()
    {
        setCountry(Country.GERMANY_DEU);
        setEntityKind(EntityKind.PLATFORM);
        setDomain(Domain.inst(PlatformDomain.SURFACE));

        setCategory((byte)50); // uid 16751, Frigate
        setSubCategory((byte)2); // uid 24114, Braunschweig Class (Type K130)
        setSpecific((byte)1); // uid 24115, F 260 Braunschweig
    }
}
