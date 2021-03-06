package edu.nps.moves.dis7.entities.lva.platform.surface;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * SISO-REF-010-v28 (2020-05-07)
 * name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$SpecificElem@3b9d6699;
 * Country: Latvia (LVA);
 * Entity kind: Platform;
 * Domain: SURFACE;
 *
 * Entity type uid: 28305
 */
public class M07Visvaldis extends EntityType
{
    /** Default constructor */
    public M07Visvaldis()
    {
        setCountry(Country.LATVIA_LVA);
        setEntityKind(EntityKind.PLATFORM);
        setDomain(Domain.inst(PlatformDomain.SURFACE));

        setCategory((byte)8); // uid 27786, Mine Countermeasure Ship/Craft
        setSubCategory((byte)3); // uid 28301, Alkmaar (Tripartite) Class
        setSpecific((byte)4); // uid 28305, M-07 Visvaldis
    }
}
