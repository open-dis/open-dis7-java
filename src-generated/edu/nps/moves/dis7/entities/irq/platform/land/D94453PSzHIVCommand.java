package edu.nps.moves.dis7.entities.irq.platform.land;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * SISO-REF-010-v28 (2020-05-07)
 * name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$SpecificElem@1253e7cb;
 * Country: Iraq (IRQ);
 * Entity kind: Platform;
 * Domain: LAND;
 *
 * Entity type uid: 23534
 */
public class D94453PSzHIVCommand extends EntityType
{
    /** Default constructor */
    public D94453PSzHIVCommand()
    {
        setCountry(Country.IRAQ_IRQ);
        setEntityKind(EntityKind.PLATFORM);
        setDomain(Domain.inst(PlatformDomain.LAND));

        setCategory((byte)2); // uid 17986, Armored Fighting Vehicle
        setSubCategory((byte)4); // uid 23532, D-944 PSzH-IV
        setSpecific((byte)2); // uid 23534, D-944.53 PSzH-IV Command
    }
}
