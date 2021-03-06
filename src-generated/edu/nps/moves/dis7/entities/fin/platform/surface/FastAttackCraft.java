package edu.nps.moves.dis7.entities.fin.platform.surface;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * SISO-REF-010-v28 (2020-05-07)
 * name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$CategoryElem@5aebe890;
 * Country: Finland (FIN);
 * Entity kind: Platform;
 * Domain: SURFACE;
 *
 * Entity type uid: 29709
 */
public class FastAttackCraft extends EntityType
{
    /** Default constructor */
    public FastAttackCraft()
    {
        setCountry(Country.FINLAND_FIN);
        setEntityKind(EntityKind.PLATFORM);
        setDomain(Domain.inst(PlatformDomain.SURFACE));

        setCategory((byte)64); // uid 29709, Fast Attack Craft
    }
}
