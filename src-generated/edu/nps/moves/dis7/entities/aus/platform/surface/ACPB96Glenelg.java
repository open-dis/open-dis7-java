package edu.nps.moves.dis7.entities.aus.platform.surface;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * SISO-REF-010-v28 (2020-05-07)
 * name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$SpecificElem@7a92922;
 * Country: Australia (AUS);
 * Entity kind: Platform;
 * Domain: SURFACE;
 *
 * Entity type uid: 25239
 */
public class ACPB96Glenelg extends EntityType
{
    /** Default constructor */
    public ACPB96Glenelg()
    {
        setCountry(Country.AUSTRALIA_AUS);
        setEntityKind(EntityKind.PLATFORM);
        setDomain(Domain.inst(PlatformDomain.SURFACE));

        setCategory((byte)7); // uid 17524, Light/Patrol Craft
        setSubCategory((byte)3); // uid 25225, Armidale Class
        setSpecific((byte)14); // uid 25239, ACPB 96 Glenelg
    }
}
