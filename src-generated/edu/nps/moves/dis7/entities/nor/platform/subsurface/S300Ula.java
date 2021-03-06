package edu.nps.moves.dis7.entities.nor.platform.subsurface;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * SISO-REF-010-v28 (2020-05-07)
 * name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$SpecificElem@1fc793c2;
 * Country: Norway (NOR);
 * Entity kind: Platform;
 * Domain: SUBSURFACE;
 *
 * Entity type uid: 27617
 */
public class S300Ula extends EntityType
{
    /** Default constructor */
    public S300Ula()
    {
        setCountry(Country.NORWAY_NOR);
        setEntityKind(EntityKind.PLATFORM);
        setDomain(Domain.inst(PlatformDomain.SUBSURFACE));

        setCategory((byte)5); // uid 18989, SS(Conventional Attack-Torpedo Patrol)
        setSubCategory((byte)2); // uid 18997, Ula Class
        setSpecific((byte)1); // uid 27617, S300 Ula
    }
}
