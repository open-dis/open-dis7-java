package edu.nps.moves.dis7.entities.lva.platform.surface;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * SISO-REF-010-v28 (2020-05-07)
 * name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$SubCategoryElem@21694e53;
 * Country: Latvia (LVA);
 * Entity kind: Platform;
 * Domain: SURFACE;
 *
 * Entity type uid: 28301
 */
public class AlkmaarTripartiteClass extends EntityType
{
    /** Default constructor */
    public AlkmaarTripartiteClass()
    {
        setCountry(Country.LATVIA_LVA);
        setEntityKind(EntityKind.PLATFORM);
        setDomain(Domain.inst(PlatformDomain.SURFACE));

        setCategory((byte)8); // uid 27786, Mine Countermeasure Ship/Craft
        setSubCategory((byte)3); // uid 28301, Alkmaar (Tripartite) Class
    }
}
